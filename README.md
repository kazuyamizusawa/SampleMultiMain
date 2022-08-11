# SampleMultiMain

- 構成図

```
SampleMultiMain
|   build.gradle
|   gradle.properties
|   gradlew
|   gradlew.bat
|   README.md
|   settings.gradle
|   tree.txt
|   
\---src
    +---main
    |   +---java
    |   |   \---com
    |   |       +---example
    |   |       |       MultiMainApplication.java
    |   |       |       
    |   |       \---example2
    |   |               MultiMainApplication2.java
    |   |               
    |   \---resources
    |           log4j2-spring.xml
```

- warファイルを作成するには

```
cd [カレントパス]/SampleMultiMain

gradlew -Penv=main1

gradlew -Penv=main2

※SampleMultiMain/build/libsにwarが出力されます
```

