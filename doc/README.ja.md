<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">自由で軽量な Android 向けストリーミングフロントエンド</h4>

Rillvoro は [NewPipe](https://github.com/TeamNewPipe/NewPipe) から派生した独立プロジェクトです。

[English](/README.md) · [Deutsch](/doc/README.de.md) · [Español](/doc/README.es.md) · [Français](/doc/README.fr.md) · [हिन्दी](/doc/README.hi.md) · [Italiano](/doc/README.it.md) · [한국어](/doc/README.ko.md) · [Português do Brasil](/doc/README.pt_BR.md) · [Polski](/doc/README.pl.md) · [ਪੰਜਾਬੀ](/doc/README.pa.md) · [日本語](/doc/README.ja.md) · [うちなーぐち](/doc/README.ryu.md) · [Română](/doc/README.ro.md) · [Русский](/doc/README.ru.md) · [Soomaali](/doc/README.so.md) · [Türkçe](/doc/README.tr.md) · [正體中文](/doc/README.zh_TW.md) · [অসমীয়া](/doc/README.asm.md) · [Српски](/doc/README.sr.md) · [العربية](/doc/README.ar.md)

## スクリーンショット

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

## 説明

自由なコピーレフトソフトウェアの Rillvoro は一切のGoogleフレームワークライブラリ及び、YouTube API を使用しません。ウェブサイトは必要な情報のためだけに読み込まれるため、このアプリはGoogleのサービスがインストールされていない端末でも使用できます。また、Rillvoroの使用にYouTubeアカウントは必要ありません。

### 機能

* 動画の検索
* 動画の基本情報の表示
* YouTube の動画の視聴
* YouTube の動画のバックグラウンド再生
* ポップアップモード (フローティングプレイヤー)
* 動画を視聴するストリーミングプレイヤーの選択
* 動画のダウンロード
* 音声のみのダウンロード
* Kodiでの動画再生
* 次の動画/関連動画の表示
* 特定の言語の YouTube の検索
* 年齢制限のあるコンテンツの視聴/ブロック
* チャンネルの基本情報の表示
* チャンネルの検索
* チャンネルからの動画の視聴
* Orbot/Tor 対応 (直接的なものは未実装)
* 1080p/2K/4K 対応
* 履歴の表示
* チャンネルの登録
* 履歴の検索
* 再生リストの検索/視聴
* 再生リストをキューに追加して再生
* 動画のキューへの追加
* 端末内の再生リスト
* 字幕
* ライブ配信の対応
* コメントの表示

### 対応しているサービス

* YouTube
* SoundCloud \[ベータ\]
* media.ccc.de \[ベータ\]
* PeerTube インスタンス \[ベータ\]
* Bandcamp \[ベータ\]

## インストールと更新

デバッグ APK をビルドするには、JDK 21 と Android SDK をインストールしてから、以下のコマンドを実行してください。

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

端末を接続して USB デバッグを有効にし、以下のコマンドを実行してください。

```sh
./gradlew :app:installDebug
```

## 貢献

[貢献](/.github/CONTRIBUTING.md) · [GitHub Issues](https://github.com/culpen90/Rillvoro/issues)

## プライバシーポリシー

[プライバシーポリシー](/doc/privacy.md)

## ライセンス
[![GNU GPLv3 のロゴ](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

Rillvoro はフリーソフトウェアなので、あなたはあなたの望むように使用、習得、共有、改善を行えます。
具体的には、フリーソフトウェア財団により公開された [GNU General Public License](https://www.gnu.org/licenses/gpl.html) のバージョン3のライセンスもしくは、(あなたの選択で) いずれかの後継バージョンの規約の元で配布または改変を行うことができます。
