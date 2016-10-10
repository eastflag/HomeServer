package com.eastflag;

import org.junit.Ignore;
import org.junit.Test;

import java.io.File;

/**
 * Created by eastflag on 2016-05-10.
 */
public class FileTest {
    @Ignore
    @Test
    public void FileTest() {
        File file = new File(Constant.ROOT_FOLDER + Constant.UPLOAD_FOLDER);
        System.out.println(file.getAbsolutePath());
    }

    /*@Test
    public void checkName() {
        String name = "욕실용 바이오실리콘/곰팡이방지 화장실 향균용 씰링333";


        System.out.println("crop:" + cropString(name, 50));
    }

    private String cropString(String name, int crop_length) {
        int count = 0;
        for(int i=0; i<name.length(); ++i) {
            int calulated_count = 0;
            if (name.substring(i, i+1).getBytes().length > 1) {
                calulated_count = 2;
            } else {
                calulated_count = 1;
            }

            count += calulated_count;

            if(count>crop_length) {
                return name.substring(0, i);
            }
        }

        return name;
    }*/
}
