# ChunkCollector-API
API for ChunkCollector Plugin

Using the pom.xml in maven:
```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.McDoJr</groupId>
        <artifactId>ChunkCollector-API</artifactId>
        <version>1.4.2</version>
    </dependency>
</dependencies>
```

Using the build.gradle in gradle:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
dependencies {
        implementation 'com.github.McDoJr:ChunkCollector-API:1.4.2'
}
```
