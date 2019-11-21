package cn.com.caspar.ots.utils.io;

import com.google.common.base.Preconditions;

import java.io.File;

public class FileUtil {

    public static File file(String path) {
        Preconditions.checkNotNull(path, "File path is blank!");
        return new File(path);
    }
}
