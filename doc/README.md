<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">A lightweight, libre streaming app built exclusively for Android.</h4>

Rillvoro is an independent fork of [NewPipe](https://github.com/TeamNewPipe/NewPipe).

[English](/README.md) · [Deutsch](/doc/README.de.md) · [Español](/doc/README.es.md) · [Français](/doc/README.fr.md) · [हिन्दी](/doc/README.hi.md) · [Italiano](/doc/README.it.md) · [한국어](/doc/README.ko.md) · [Português do Brasil](/doc/README.pt_BR.md) · [Polski](/doc/README.pl.md) · [ਪੰਜਾਬੀ](/doc/README.pa.md) · [日本語](/doc/README.ja.md) · [うちなーぐち](/doc/README.ryu.md) · [Română](/doc/README.ro.md) · [Русский](/doc/README.ru.md) · [Soomaali](/doc/README.so.md) · [Türkçe](/doc/README.tr.md) · [正體中文](/doc/README.zh_TW.md) · [অসমীয়া](/doc/README.asm.md) · [Српски](/doc/README.sr.md) · [العربية](/doc/README.ar.md)

## Screenshots

[<img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/00.png" width=160>](/fastlane/metadata/android/en-US/images/phoneScreenshots/00.png)
[<img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/01.png" width=160>](/fastlane/metadata/android/en-US/images/phoneScreenshots/01.png)
[<img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/02.png" width=160>](/fastlane/metadata/android/en-US/images/phoneScreenshots/02.png)
[<img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/03.png" width=160>](/fastlane/metadata/android/en-US/images/phoneScreenshots/03.png)
[<img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/04.png" width=160>](/fastlane/metadata/android/en-US/images/phoneScreenshots/04.png)
[<img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/05.png" width=160>](/fastlane/metadata/android/en-US/images/phoneScreenshots/05.png)
[<img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/06.png" width=160>](/fastlane/metadata/android/en-US/images/phoneScreenshots/06.png)
[<img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/07.png" width=160>](/fastlane/metadata/android/en-US/images/phoneScreenshots/07.png)
[<img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/08.png" width=160>](/fastlane/metadata/android/en-US/images/phoneScreenshots/08.png)
<br/><br/>
[<img src="/fastlane/metadata/android/en-US/images/tenInchScreenshots/09.png" width=405>](/fastlane/metadata/android/en-US/images/tenInchScreenshots/09.png)
[<img src="/fastlane/metadata/android/en-US/images/tenInchScreenshots/10.png" width=405>](/fastlane/metadata/android/en-US/images/tenInchScreenshots/10.png)

### Supported Services

* YouTube ([website](https://www.youtube.com/)) and YouTube Music ([website](https://music.youtube.com/)) ([wiki](https://en.wikipedia.org/wiki/YouTube))
* PeerTube ([website](https://joinpeertube.org/)) and all its instances (open the website to know what that means!) ([wiki](https://en.wikipedia.org/wiki/PeerTube))
* Bandcamp ([website](https://bandcamp.com/)) ([wiki](https://en.wikipedia.org/wiki/Bandcamp))
* SoundCloud ([website](https://soundcloud.com/)) ([wiki](https://en.wikipedia.org/wiki/SoundCloud))
* media.ccc.de ([website](https://media.ccc.de/)) ([wiki](https://en.wikipedia.org/wiki/Chaos_Computer_Club))

## Description

Rillvoro works by fetching the required data from the official API (e.g. PeerTube) of the service you're using. If the official API is restricted (e.g. YouTube) for our purposes, or is proprietary, the app parses the website or uses an internal API instead. This means that you don't need an account on any service to use Rillvoro.

Also, since they are free and open source software, neither the app nor the Extractor use any proprietary libraries or frameworks, such as Google Play Services. This means you can use Rillvoro on devices or custom ROMs that do not have Google apps installed.

### Features

* Watch videos at resolutions up to 4K
* Listen to audio in the background, only loading the audio stream to save data
* Popup mode (floating player, aka Picture-in-Picture)
* Watch live streams
* Show/hide subtitles/closed captions
* Search videos and audios (on YouTube, you can specify the content language as well)
* Enqueue videos (and optionally save them as local playlists)
* Show/hide general information about videos (such as description and tags)
* Show/hide next/related videos
* Show/hide comments
* Search videos, audios, channels, playlists and albums
* Browse videos and audios within a channel
* Subscribe to channels (yes, without logging into any account!)
* Get notifications about new videos from channels you're subscribed to
* Create and edit channel groups (for easier browsing and management)
* Browse video feeds generated from your channel groups
* View and search your watch history
* Search and watch playlists (these are remote playlists, which means they're fetched from the service you're browsing)
* Create and edit local playlists (these are created and saved within the app, and have nothing to do with any service)
* Download videos/audios/subtitles (closed captions)
* Open in Kodi
* Watch/Block age-restricted material

## Installation and updates

To build the Android debug APK, install JDK 21 and the Android SDK, then run these commands.

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

With your device connected and USB debugging enabled, run

```sh
./gradlew :app:installDebug
```

## FAQ

**Can I keep NewPipe installed?** Yes. Rillvoro uses its own Android package ID, `io.github.culpen90.rillvoro`. Android stores the two apps’ data separately.

**How do I bring over my subscriptions, playlists and history?** In NewPipe, open **Settings → Backup and restore → Export database**. In Rillvoro, open **Settings → Backup and restore → Import database** and choose that file. Importing replaces the database in Rillvoro. If you already use Rillvoro, export its database first to keep a copy.

## Contribution

For build setup, translations and development, see the [contribution guidelines](/.github/CONTRIBUTING.md). Report problems in [GitHub Issues](https://github.com/culpen90/Rillvoro/issues).

## Privacy Policy

Read how Rillvoro stores data, contacts streaming services and handles [error reports](/doc/privacy.md).

## License

[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

Rillvoro is Free Software: You can use, study, share, and improve it at will. Specifically you can redistribute and/or modify it under the terms of the [GNU General Public License](https://www.gnu.org/licenses/gpl.html) as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

NewPipe is a registered word mark. The upstream project publishes its [trademark policy](https://newpipe-ev.de/policy/trademark/).
