<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">Android için hafif ve özgür bir akış arayüzü.</h4>

Rillvoro, [NewPipe](https://github.com/TeamNewPipe/NewPipe) tabanlı bağımsız bir projedir.

[English](/README.md) · [Deutsch](/doc/README.de.md) · [Español](/doc/README.es.md) · [Français](/doc/README.fr.md) · [हिन्दी](/doc/README.hi.md) · [Italiano](/doc/README.it.md) · [한국어](/doc/README.ko.md) · [Português do Brasil](/doc/README.pt_BR.md) · [Polski](/doc/README.pl.md) · [ਪੰਜਾਬੀ](/doc/README.pa.md) · [日本語](/doc/README.ja.md) · [うちなーぐち](/doc/README.ryu.md) · [Română](/doc/README.ro.md) · [Русский](/doc/README.ru.md) · [Soomaali](/doc/README.so.md) · [Türkçe](/doc/README.tr.md) · [正體中文](/doc/README.zh_TW.md) · [অসমীয়া](/doc/README.asm.md) · [Српски](/doc/README.sr.md) · [العربية](/doc/README.ar.md)

## Ekran görüntüleri

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

## Açıklama

Rillvoro herhangi bir Google çerçeve kütüphanesini, ya da YouTube API hizmetlerini kullanmaz. Gerekli web hizmetleri yalnızca gerekli bilgileri almak için kaynak olarak kullanılır, bu nedenle bu uygulama Google hizmetleri yüklü olmayan cihazlarda da kullanılabilir. Ayrıca, copyleft özgür yazılımı olan Rillvoro'ı kullanmak için bir YouTube hesabına ihtiyacınız yoktur.

### Özellikler

* Video arama
* Videolar hakkında genel bilgileri görüntüleme
* YouTube videoları izleme
* YouTube videolarını dinleme
* Pop-up modu (hareketli oynatıcı)
* Video izlemek için akış oynatıcısını seçme
* Video indirme
* Sadece ses indirme
* Videoyu Kodi'de açma
* Sonraki video/ilgili videolar
* YouTube'u belirli bir dilde arayın
* Yaş sınırlı içeriği izleme/engelleme
* Kanallar hakkındaki genel bilgileri görüntüleme
* Kanal arama
* Bir kanaldaki videoları izleme
* Orbot/Tor desteği (henüz direkt olarak değil)
* 1080p/2K/4K desteği
* Geçmişi görme
* Kanallara abone olma
* Geçmişte arama
* Oynatma listesi arama/oynatma
* Çalma listelerini sıralayıp oynatın
* Videoları sırayla oynatın
* Yerel oynatma listeleri
* Altyazılar
* Canlı yayın desteği
* Yorumları görme

### Desteklenen servisler

* YouTube
* SoundCloud \[beta\]
* media.ccc.de \[beta\]
* PeerTube \[beta\]
* Bandcamp \[beta\]

## Kurulum ve güncellemeler

Hata ayıklama APK’sını derlemek için JDK 21 ve Android SDK’yı kurup şu komutları çalıştırın.

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

Cihazı bağlayın, USB hata ayıklamayı açın ve şu komutu çalıştırın

```sh
./gradlew :app:installDebug
```

## Katkıda bulunma

[Katkıda bulunma](/.github/CONTRIBUTING.md) · [GitHub Issues](https://github.com/culpen90/Rillvoro/issues)

## Gizlilik politikası

[Gizlilik politikası](/doc/privacy.md)

## Lisans
[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

Rillvoro özgür bir yazılımdır. Kendi başınıza kullanabilir, öğrenebilir, paylaşabilir
ve geliştirebilirsiniz. Free Software Foundation tarafından yayınlanan GNU Genel Kamu Lisansı,
Lisansın 3. sürümü veya (isteğe bağlı olarak) daha sonraki bir sürümü şartları ve
koşulları altında yeniden dağıtabilir ve/veya değiştirebilirsiniz.
