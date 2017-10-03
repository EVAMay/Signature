package gesturesignature.fengunion.com.gesturesignature.utils;

import android.util.Log;

import java.io.File;

/**
 * Created by May on 2017/10/3.
 */

public class FileUtil {
    public static String filePath="/sdcard/Test/";
    public static String fileName="graph.png";

    public static void creatDir(){
        File file=null;
        file=new File(filePath);
        try {
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception e) {
            Log.e("fileError",e.getMessage());
        }

    }
}
