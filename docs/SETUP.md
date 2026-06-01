# Checkmate App - Setup Guide

## Development Environment Setup

### Prerequisites

1. **Android Studio** (2021.1 or newer)
   - Download from [developer.android.com](https://developer.android.com/studio)
   - Install Android SDK 26+ and build tools

2. **Java Development Kit (JDK)**
   - JDK 11 or higher
   - Set `JAVA_HOME` environment variable

3. **Git**
   - For version control

### Installation Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/simonajay2007-prog/Checkmate-app.git
   cd Checkmate-app
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Click "Open"
   - Navigate to the Checkmate-app directory
   - Wait for Gradle sync to complete

3. **Configure Android Virtual Device (AVD)**
   - Open AVD Manager in Android Studio
   - Create a new virtual device
   - Select Android 9 (API 28) or higher
   - Allocate sufficient RAM (2GB+)

4. **Build the project**
   ```bash
   ./gradlew build
   ```

5. **Run the app**
   ```bash
   ./gradlew installDebug
   ```

## Project Structure

```
Checkmate-app/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/checkmate/app/
│   │   │   │   ├── MainActivity.kt          # Entry point
│   │   │   │   ├── ui/
│   │   │   │   │   ├── screens/            # UI screens
│   │   │   │   │   └── theme/              # Theme configuration
│   │   │   │   ├── data/
│   │   │   │   │   ├── model/              # Data models
│   │   │   │   │   ├── local/              # Local database
│   │   │   │   │   └── remote/             # API calls
│   │   │   │   └── utils/                  # Helper functions
│   │   │   ├── res/
│   │   │   │   ├── values/
│   │   │   ��   ├── drawable/
│   │   │   │   └── layout/
│   │   │   └── AndroidManifest.xml
│   │   └── test/                          # Unit tests
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

## Key Technologies

- **Kotlin**: Modern Android development language
- **Jetpack Compose**: Declarative UI framework
- **Room Database**: Local data persistence
- **Retrofit**: HTTP client
- **Coroutines**: Asynchronous programming
- **FreeRDP**: Remote desktop protocol support

## Building for Release

1. **Create a signing key**
   ```bash
   keytool -genkey -v -keystore release.keystore -keyalg RSA -keysize 2048 -validity 10000 -alias checkmate
   ```

2. **Configure signing in build.gradle**
   ```gradle
   signingConfigs {
       release {
           storeFile file('release.keystore')
           storePassword = System.getenv("KEYSTORE_PASSWORD")
           keyAlias = 'checkmate'
           keyPassword = System.getenv("KEY_PASSWORD")
       }
   }
   ```

3. **Build release APK**
   ```bash
   ./gradlew assembleRelease
   ```

4. **Output location**
   - `app/release/app-release.apk`

## Testing

### Unit Tests
```bash
./gradlew test
```

### Instrumented Tests
```bash
./gradlew connectedAndroidTest
```

## Troubleshooting

### Gradle Sync Issues
- Click "Sync Now" in Android Studio
- If persistent, invalidate cache: File → Invalidate Caches

### Build Failures
- Check Android SDK versions in settings.gradle
- Verify JDK version: `java -version`
- Clean build: `./gradlew clean build`

### Emulator Performance
- Use x86_64 ABI for better performance
- Allocate 2GB+ RAM to AVD
- Enable GPU acceleration

## Next Steps

1. Familiarize yourself with the codebase
2. Check the issues page for tasks
3. Review CONTRIBUTING.md for guidelines
4. Join discussions for feature planning

For more help, refer to [Android Documentation](https://developer.android.com/docs).
