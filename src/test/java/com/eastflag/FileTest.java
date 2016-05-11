package com.eastflag;

import org.junit.Test;

import java.io.File;

/**
 * Created by eastflag on 2016-05-10.
 */
public class FileTest {
    @Test
    public void FileTest() {
        File file = new File(Constant.ROOT_FOLDER + Constant.UPLOAD_FOLDER);
        System.out.println(file.getAbsolutePath());
    }
}
