 package com.example.qrdemo_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.util.Log;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zbar.ZBarScannerView;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

 public class ScanCodeActivity extends AppCompatActivity  implements ZBarScannerView.ResultHandler {




     private ZBarScannerView mScannerView;









     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         mScannerView = new ZBarScannerView(this);    // Programmatically initialize the scanner view
         setContentView(mScannerView);




     }

     public void onResume() {
         super.onResume();
         mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
         mScannerView.startCamera();          // Start camera on resume
     }
     @Override
     public void onPause() {
         super.onPause();
         mScannerView.stopCamera();           // Stop camera on pause
     }



     @Override
     public void handleResult(me.dm7.barcodescanner.zbar.Result rawResult) {

         Intent interneteGec=new Intent(ScanCodeActivity.this,internet.class);
         startActivity(interneteGec);

     }
 }




