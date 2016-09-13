package club.lovety.fastdfs.service;

import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by ty on 2016/9/13.
 */
@Service
public class FdfsService {



    /**
     *
     * @return
     */
    public String doExecute(MultiValueMap<String, MultipartFile> multiValueMap) {

        if(null != multiValueMap && !multiValueMap.isEmpty()){
            multiValueMap.entrySet().forEach(e -> {
               List<MultipartFile> multipartFileList =  e.getValue();

            });
        }

        return null;
    }

    private String uploadToStorage(List<MultipartFile> multipartFiles){

        return null;
    }

    private String uploadToStorage(MultipartFile multipartFile){
//        multipartFile.transferTo();
//        IOUtils.to
        return null;
    }




}
