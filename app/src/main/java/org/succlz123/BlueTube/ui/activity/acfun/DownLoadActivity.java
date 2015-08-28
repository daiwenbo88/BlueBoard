package org.succlz123.bluetube.ui.activity.acfun;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.succlz123.bluetube.R;
import org.succlz123.bluetube.bean.acfun.AcContentInfo;
import org.succlz123.bluetube.support.helper.acfun.AcString;
import org.succlz123.bluetube.ui.activity.BaseActivity;

import java.util.ArrayList;

import butterknife.ButterKnife;

/**
 * Created by succlz123 on 15/8/21.
 */
public class DownLoadActivity extends BaseActivity {

    public static void startActivity(Context activity, ArrayList<AcContentInfo.DataEntity.FullContentEntity.VideosEntity> downLoadList) {
        Intent intent = new Intent(activity, DownLoadActivity.class);
        intent.putParcelableArrayListExtra(AcString.DOWNLOAD_LIST, downLoadList);

        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        ButterKnife.bind(this);

        ArrayList<AcContentInfo.DataEntity.FullContentEntity.VideosEntity> downLoadList
                =getIntent().getParcelableArrayListExtra(AcString.DOWNLOAD_LIST);



    }
}
