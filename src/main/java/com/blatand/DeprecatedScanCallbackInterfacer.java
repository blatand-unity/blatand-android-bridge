package com.blatand;

import java.util.List;

import android.util.Log;

import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;

public class DeprecatedScanCallbackInterfacer implements android.bluetooth.BluetoothAdapter.LeScanCallback
{
    private com.blatand.DeprecatedScanCallback m_interface;

    public DeprecatedScanCallbackInterfacer(com.blatand.DeprecatedScanCallback inter) {
        m_interface = inter;
    }

    @Override
    public void onLeScan(BluetoothDevice device, int rssi, byte[] scanRecord)
    {
        Log.i("Unity", "Bluetooth LE: Scanned device: " + "(name: " + device.getName() + ")");

        m_interface.OnLeScan(device, rssi);
    }
}