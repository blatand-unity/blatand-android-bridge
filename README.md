# blatand-android-bridge

## Installation

### From binary
 
You can download an aar from GitHub's [releases page](https://github.com/blatand-unity/blatand-android-bridge/releases).

Copy the .aar file into any of your project folders, then select it in Unity to open the Import Settings in the Inspector window. Tick the Android checkbox to mark this .aar file as compatible with Unity then select it in Unity to open the Import Settings in the Inspector window. Tick the Android checkbox to mark this .aar file as compatible with Unity:
![ARR plug-in import settings as displayed in the Inspector window](https://docs.unity3d.com/uploads/Main/AndroidARRPlugins.png)

### From source

You can download sources from GitHub's [releases page](https://github.com/blatand-unity/blatand-android-bridge/releases) or [latest version](https://github.com/blatand-unity/blatand-android-bridge/archive/master.zip)(unstable).
Unzip sources in the `Assets/Plugins/Android/` folder and Unity3D will detect the module as an android library.

If you are using Git with Unity3D, it's the best way. Install it as a submodule:
```
git submodule add git://github.com/blatand-unity/blatand-android-bridge.git Assets/Plugins/Android/Blatand
```

## Building

 - Locate the classes.jar included with Unity. It is found in the installation folder (usually `C:\Program Files\Unity\Editor\Data` (on Windows) or `/Applications/Unity` (on Mac)) in a subfolder called `PlaybackEngines/AndroidPlayer/Variations/mono` or `il2cpp/Development` or `Release/Classes/`. Then copy `classes.jar` to `libs` folder.
   
 - Build with gradle
   ```
   ./gradlew build
   ```
   
 - Get libraries in `build/outputs/aar/`
   
## License

MIT. See the [LICENSE](LICENSE) file for details.
