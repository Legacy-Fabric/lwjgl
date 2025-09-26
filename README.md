# Legacy Fabric LWJGL 2 fork
## Summary
This is Legacy Fabric own fork of LWJGL 2.
## Features over the original LWJGL 2
### More platform supported
#### LWJGL
| OS      | x64/amd64 | x86 | arm64/aarch64 | armhf | armel | riscv64 | ppc64le |
|---------|-----------|-----|---------------|-------|-------|---------|---------|
| linux   | x         | x   | x             | x     | x     | x       | x       |
| windows | x         | x   | x             |       |       |         |         |
| macos   | x         |     | x             |       |       |         |         |
#### Bundled OpenAL
| OS      | x64/amd64 | x86 | arm64/aarch64 | armhf | armel | riscv64 | ppc64le |
|---------|-----------|-----|---------------|-------|-------|---------|---------|
| linux   | x         | x   | x             | x     |       | x       | x       |
| windows | x         | x   | x             |       |       |         |         |
| macos   | x         |     | x             |       |       |         |         |
### Fixes
#### macOS
* Update minimum supported version to 10.11 for x64 and 11.0 for arm64
* Fix High DPI outside fullscreen
* dispatch calls from main thread
* Fix crash when resizing windows
* Include HAS_HIDPI_FIX field
#### Linux
* Don't crash when xrandr executable is not accessible
* Fix crash on Java 11+ due to missing symbols

### Other
The project has been mostly converted from ant to gradle modules, a few task a still ran through gradle's builtin compatibility layer for ant.

To compile the project, you need to have both a JDK 8 and a 17+ one.

The project structure has been reorganized.

#### Modules structure
* `lwjgl-common`: classes used by every other module
* `generator`: Annotation processor used to generate bindings
* `lwjgl-templates`: Classes from which bindings are generated
* `lwjgl`: Most classes of the library live here
* `lwjgl-platform`: Native code to compile into natives
* `lwjgl_examples`: Example projects using the library

## Credits
- The original LWJGL maintainers
- zcronix: some of the modernising fixes
- MinecraftMachina team: macOs arm64 fixes and support
- Babric team and js6pak: some linux fixes
- Colin McDonald, Wyvest and Fadenfire: more macOs fixes

# Original Readme
## [LEGACY] LWJGL - Lightweight Java Game Library

> **WARNING**
> 
> This is the repository of the original LWJGL, which is no longer actively maintained. Unless you have released a product that uses LWJGL 2.x, you should probably be looking at [LWJGL 3](https://github.com/LWJGL/lwjgl3).

The Lightweight Java Game Library (LWJGL) is a solution aimed directly at professional and amateur Java programmers alike to enable commercial quality games to be written in Java. 
LWJGL provides developers access to high performance cross-platform libraries such as OpenGL (Open Graphics Library), OpenCL (Open Computing Language) and OpenAL (Open Audio Library) allowing for state of the art 3D games and 3D sound.
Additionally, LWJGL provides access to controllers such as Game-pads, Steering wheel and Joysticks.
All in a simple and straight forward API.

Website: [http://legacy.lwjgl.org](http://legacy.lwjgl.org)
Forum: [http://forum.lwjgl.org](http://forum.lwjgl.org)
Bugs/Suggestions: [https://github.com/LWJGL/lwjgl/issues](https://github.com/LWJGL/lwjgl/issues)

Compilation
-----------

LWJGL requires a JDK 8, as well as your platforms native compiler to compile the JNI.

* gradlew generate-all
* gradlew compile
* gradlew compile_native

-----------

