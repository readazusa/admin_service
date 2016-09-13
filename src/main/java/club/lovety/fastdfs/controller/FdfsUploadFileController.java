package club.lovety.fastdfs.controller;

import club.lovety.common.Result;
import club.lovety.fastdfs.service.FdfsService;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by ty on 2016/9/13.
 * fastdfs上传文件处理controller
 */
@RequestMapping("fdfs_upload")
@Controller
public class FdfsUploadFileController {

    @Resource
    private FdfsService fdfsService;

    @RequestMapping(value = "upload",method = RequestMethod.POST)
    @ResponseBody
    public Object upload(HttpServletRequest request){
        Result result = new Result();
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        MultiValueMap<String,MultipartFile>  multiValueMap = multipartHttpServletRequest.getMultiFileMap();
        return result;
    }






}
