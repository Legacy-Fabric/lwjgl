[LEGACY] LWJGL - Lightweight Java Game Library
======

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
Supported platforms


| OS      | x64/amd64 | x86 | arm64/aarch64 | armhf | armel | riscv64 |
|---------|-----------|-----|---------------|-------|-------|---------|
| linux   | x         | x   | x             | x     | x     | x       |
| windows | x         | x   | x             |       |       |         |
| macos   | x         |     | x             |       |       |         |
