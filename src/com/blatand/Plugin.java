package com.blatand;

import android.content.Context;
import android.content.Intent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;

import com.unity3d.player.UnityPlayer;

public class Plugin
{
    private static final Plugin s_instance = new Plugin();

    public static Plugin getInstance() {
        return s_instance;
    }

    private BluetoothAdapter m_bluetoothAdapter;

    public BluetoothAdapter getSystemAdapter() {
        if(m_bluetoothAdapter == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) UnityPlayer.currentActivity.getSystemService(Context.BLUETOOTH_SERVICE);
            m_bluetoothAdapter = bluetoothManager.getAdapter();
        }
        return m_bluetoothAdapter;
    }

    public void attemptEnablingBluetooth() {
        BluetoothAdapter adapter = getSystemAdapter();
        if (adapter == null || !adapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            UnityPlayer.currentActivity.startActivityForResult(enableBtIntent, 4226545);
        }
    }

    public void startLeScan(BluetoothAdapter.LeScanCallback callback)
    {
        if (m_bluetoothAdapter != null)
            m_bluetoothAdapter.startLeScan(callback);
    }

    public void stopLeScan(BluetoothAdapter.LeScanCallback callback)
    {
        if (m_bluetoothAdapter != null)
            m_bluetoothAdapter.stopLeScan(callback);
    }
}