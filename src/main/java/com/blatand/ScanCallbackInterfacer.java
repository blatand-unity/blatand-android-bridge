package com.blatand;

import java.util.List;

import android.util.Log;

import android.bluetooth.le.ScanResult;

public class ScanCallbackInterfacer extends android.bluetooth.le.ScanCallback
{
    private com.blatand.ScanCallback m_interface;

    public ScanCallbackInterfacer(com.blatand.ScanCallback inter) {
        m_interface = inter;
    }

    public void onBatchScanResults(List<ScanResult> results) {
        m_interface.OnBatchScanResults(results);
    }
    
    public void onScanFailed(int errorCode) {
        Log.i("Unity", "Bluetooth LE: Scan error: " + String.valueOf(errorCode));
        m_interface.OnScanFailed(errorCode);
    }

    public void onScanResult(int callbackType, ScanResult result) {
        Log.i("Unity", "Bluetooth LE: Scanned device: " + result.getDevice().getAddress() + "(name: " + result.getDevice().getName() + ")");
        m_interface.OnScanResult(callbackType, result);
    }
}