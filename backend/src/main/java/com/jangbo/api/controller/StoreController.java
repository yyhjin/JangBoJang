package com.jangbo.api.controller;

import com.jangbo.api.request.RoomEditPatchReq;
import com.jangbo.api.request.StoreEditPatchReq;
import com.jangbo.api.request.StoreRegisterPostReq;
import com.jangbo.api.response.RoomInfoRes;
import com.jangbo.api.response.StoreInfoRes;
import com.jangbo.api.service.FileService;
import com.jangbo.api.service.StoreService;
import com.jangbo.db.entity.Store;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Api(value = "상점api", tags = {"상점"})
@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;


    @Autowired
    FileService fileService;


    //    /*상점 전체 목록 조회*/
    @GetMapping
    @ApiOperation(value = "상점 목록 조회 api", notes = "전체 조회(대기화면에 뿌릴거임)", httpMethod = "GET")
    public ResponseEntity<List<StoreInfoRes>> findAll() {
        List<StoreInfoRes> storeInfoResList = storeService.findAll();
        return new ResponseEntity<List<StoreInfoRes>>(storeInfoResList, HttpStatus.OK);
    }

    /*상점 목록 조회*/
    @GetMapping("market/{marketNo}")
    @ApiOperation(value = "한 시장안에 상점 목록 api", notes = "전체 조회(대기화면에 뿌릴거임)", httpMethod = "GET")
    public ResponseEntity<List<Store>> findStores(@PathVariable("marketNo") Integer marketNo) {
        List<Store> storeList = storeService.findStoresByMarket(marketNo);
        return new ResponseEntity<List<Store>>(storeList, HttpStatus.OK);
    }

    /* 상점 정보 조회*/
    @GetMapping("/{storeNo}")
    @ApiOperation(value = "상점 정보 조회 api", notes = "상점번호로 정보조회(방정보 하나하나 )", httpMethod = "GET")
    public ResponseEntity<StoreInfoRes> findStoreById(@PathVariable("storeNo") Integer storeNo) {
        StoreInfoRes storeInfoRes = storeService.findStoreById(storeNo);
        return new ResponseEntity<StoreInfoRes>(storeInfoRes, HttpStatus.OK);
    }

    /*상점 등록 및 프로필 사진*/
    @PostMapping
    @ApiOperation(value = "상점 등록 api", notes = "상점등록", httpMethod = "POST")
    public ResponseEntity<Integer> save(@RequestPart(value = "storeRegisterPostReq") StoreRegisterPostReq store,


                                        @RequestPart(value = "file", required = false) MultipartFile file) throws IOException {

        if (file.isEmpty()) { //입력안하면 기본사진
            store.setStoreImg("default.png");
        } else {
            String fileName = fileService.uploadImg(store, file); //입력하면 업로드하러 넘어감
            store.setStoreImg(fileName); //변환된 파일명만 디비에 저장
        }
        Integer savedStoreNo = storeService.save(store); //상점등록을 하고 등록된 storeNo 보내준다.
        return new ResponseEntity<Integer>(savedStoreNo, HttpStatus.CREATED);
    }

    /*사진 불러오기*/
    @GetMapping("image/{storeNo}")
    @ApiOperation(value = "프로필 사진 불러오기 api", notes = "상점사진 불러오기", httpMethod = "GET")
    public ResponseEntity<String> findImgUrl(@PathVariable("storeNo") Integer storeNo) throws IOException {
        String imgUrl = fileService.downloadImg(storeNo);
        System.out.println(imgUrl);
        return new ResponseEntity<String>(imgUrl, HttpStatus.OK);
    }

    /*사진 수정*/
    @PostMapping("/image")
    @ApiOperation(value = "프로필 사진 수정 api", notes = "상점사진 수정하기", httpMethod = "POST")
    public ResponseEntity<String> updateImg(@RequestParam(value = "storeNo") Integer storeNo, @RequestPart(value = "file", required = false) MultipartFile file) throws IOException {
        fileService.updateImg(storeNo, file);
        return new ResponseEntity<String>("수정완료", HttpStatus.OK);
    }

    /*사진 삭제*/
    @DeleteMapping("/image/{storeNo}")
    @ApiOperation(value = "사진 삭제 api", notes = "상점번호로 사진 삭제", httpMethod = "DELETE")
    public ResponseEntity<Integer> deleteImg(@PathVariable("storeNo") Integer storeNo) {


        return new ResponseEntity<Integer>(fileService.deleteImg(storeNo), HttpStatus.OK);
    }


    /* 상점 수정 */
    @PatchMapping("/{storeNo}")
    @ApiOperation(value = "상점 수정 api", notes = "상점 정보 수정, 바뀐 부분만 업데이트 해준다.", httpMethod = "PATCH")
    public ResponseEntity<Integer> updateStore(@PathVariable("storeNo") Integer storeNo, @RequestBody StoreEditPatchReq storeEditPatchReq) {
        Integer updatedStoreNo = storeService.updateStore(storeNo, storeEditPatchReq);
        return new ResponseEntity<Integer>(updatedStoreNo, HttpStatus.NO_CONTENT);
    }

    /*상점 삭제*/
    @DeleteMapping("/{storeNo}")
    @ApiOperation(value = "상점 정보 삭제 api", notes = "상점번호로 정보삭제", httpMethod = "DELETE")
    public ResponseEntity<Integer> delete(@PathVariable("storeNo") Integer storeNo) {
        storeService.delete(storeNo);
        return new ResponseEntity<Integer>(storeNo, HttpStatus.NO_CONTENT);
    }

    /* 방 정보 조회 */
    @GetMapping("/room/{storeNo}")
    @ApiOperation(value = "방 정보 조회 api", notes = "상점번호로 방 정보 조회(방안의 내용)", httpMethod = "GET")
    public ResponseEntity<RoomInfoRes> findRoomById(@PathVariable("storeNo") Integer storeNo) {
        RoomInfoRes roomInfoRes = storeService.findRoomById(storeNo);
        return new ResponseEntity<RoomInfoRes>(roomInfoRes, HttpStatus.OK);
    }

    /* 방 정보 수정 */
    @PatchMapping("room/{storeNo}")
    @ApiOperation(value = "방 정보 수정 api", notes = "방 정보 수정, 바뀐 부분만 업데이트 해준다.", httpMethod = "PATCH")
    public ResponseEntity<Integer> updateRoom(@PathVariable("storeNo") Integer storeNo, @RequestBody RoomEditPatchReq roomEditPatchReq) {
        Integer updatedStoreNo = storeService.updateRoom(storeNo, roomEditPatchReq);
        return new ResponseEntity<Integer>(updatedStoreNo, HttpStatus.NO_CONTENT);
    }

}
