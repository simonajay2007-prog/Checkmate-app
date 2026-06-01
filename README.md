# Checkmate App

A powerful Android application for remote access to Windows VPS without needing a laptop.

## Features

- **Remote Desktop Access**: Connect to Windows VPS directly from your Android device
- **Lightweight**: Minimal resource usage for smooth operation on mobile devices
- **Secure Connection**: Encrypted connections to your Windows VPS
- **Easy Setup**: Simple configuration and one-tap connection
- **Multiple Sessions**: Manage multiple VPS connections
- **Touch Optimized**: Intuitive touch controls designed for mobile

## Requirements

- Android 8.0 (API level 26) or higher
- Windows VPS with RDP enabled
- Network connectivity (WiFi or mobile data)

## Installation

1. Download the APK from releases
2. Install on your Android device
3. Launch the app and configure your VPS connection
4. Connect and enjoy remote access

## Getting Started

### Configuration

1. Open Checkmate App
2. Tap "Add Server"
3. Enter your VPS details:
   - Server IP or Hostname
   - Port (default: 3389 for RDP)
   - Username
   - Password (optional - use biometric for security)
4. Tap "Connect"

### Security Best Practices

- Use strong passwords
- Enable biometric authentication when available
- Connect over VPN when on public networks
- Use SSH tunneling for additional security
- Regularly update your VPS

## Technology Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose or Material Design 3
- **Remote Access**: RDP protocol via FreeRDP or similar
- **Networking**: Coroutines + Retrofit
- **Local Storage**: Room Database
- **Security**: Biometric API, EncryptedSharedPreferences

## Development Setup

### Prerequisites

- Android Studio 2021.1 or newer
- JDK 11 or higher
- Android SDK 26+
- Gradle 7.0+

### Building

```bash
# Clone the repository
git clone https://github.com/simonajay2007-prog/Checkmate-app.git

# Navigate to project
cd Checkmate-app

# Build the app
./gradlew build

# Run on emulator or device
./gradlew installDebug
```

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines on how to contribute to this project.

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

## Support

For issues, questions, or suggestions, please open an issue on GitHub.

## Roadmap

- [ ] v1.0: Basic RDP connection
- [ ] v1.1: Multiple device support
- [ ] v1.2: File transfer capability
- [ ] v2.0: VNC protocol support
- [ ] v2.1: Cloud synchronization
- [ ] v3.0: Voice/video communication
