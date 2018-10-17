package com.blatand;

import java.util.List;

import android.bluetooth.le.ScanResult;

public interface ScanCallback
{
    public void OnBatchScanResults(List<ScanResult> results);
    
    public void OnScanFailed(int errorCode);

    public void OnScanResult(int callbackType, ScanResult result);
}