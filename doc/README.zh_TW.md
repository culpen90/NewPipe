<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">輕巧的 Android 串流前端</h4>

Rillvoro 是從 [NewPipe](https://github.com/TeamNewPipe/NewPipe) 衍生的獨立專案。

[English](/README.md) · [Deutsch](/doc/README.de.md) · [Español](/doc/README.es.md) · [Français](/doc/README.fr.md) · [हिन्दी](/doc/README.hi.md) · [Italiano](/doc/README.it.md) · [한국어](/doc/README.ko.md) · [Português do Brasil](/doc/README.pt_BR.md) · [Polski](/doc/README.pl.md) · [ਪੰਜਾਬੀ](/doc/README.pa.md) · [日本語](/doc/README.ja.md) · [うちなーぐち](/doc/README.ryu.md) · [Română](/doc/README.ro.md) · [Русский](/doc/README.ru.md) · [Soomaali](/doc/README.so.md) · [Türkçe](/doc/README.tr.md) · [正體中文](/doc/README.zh_TW.md) · [অসমীয়া](/doc/README.asm.md) · [Српски](/doc/README.sr.md) · [العربية](/doc/README.ar.md)

## 截圖

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

## 說明

Rillvoro 不使用任何 Google 架構的函式庫或 Youtube API。因為只解析網站來取得必要資訊，此軟體可以在沒有安裝 Google 服務的裝置上使用。此外，使用 Rillvoro 不需要 YouTube 帳號。Rillvoro 是個 copyleft 自由軟體。

### 功能

* 搜索影片
* 無須登入
* 顯示影片的基本資訊
* 播放 Youtube 影片
* 收聽 Youtube 影片
* 彈出模式（懸浮模式）
* 選擇串流播放器來播放影片
* 下載影片
* 只下載音訊
* 在 Kodi 開啟影片
* 顯示上/下一部影片
* 搜尋特定語言的影片
* 播放/屏蔽有年齡限的制內容
* 顯示頻道資訊
* 搜索頻道
* 觀看頻道影片
* 支援 Orbot/Tor （目前未直接實裝）
* 支援 1080p/2K/4K
* 觀看歷史
* 訂閱頻道
* 搜尋歷史
* 搜索/播放播放清單
* 將播放清單加入待播清單
* 將影片加入待播清單
* 末端播放清單
* 字幕
* 支援直播
* 顯示評論

### 支援的網站

* YouTube
* SoundCloud \[測試\]
* media.ccc.de \[測試\]
* PeerTube instances \[測試\]
* Bandcamp \[測試\]

## 安裝與更新

若要建置偵錯版 APK，請安裝 JDK 21 和 Android SDK，再執行以下指令。

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

連接裝置並開啟 USB 偵錯後，請執行以下指令。

```sh
./gradlew :app:installDebug
```

## 貢獻

[貢獻](/.github/CONTRIBUTING.md) · [GitHub Issues](https://github.com/culpen90/Rillvoro/issues)

## 隱私權政策

[隱私權政策](/doc/privacy.md)

## 授權條款
[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

Rillvoro 是自由軟體：可以任意使用、研究、分享或更改。在自由軟體基金會發布的[ GPL 通用公眾授權條款]（第三或更新的版本）下可以重新散佈與/或修改。
