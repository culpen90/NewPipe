<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">Wolny, lekki streamingowy frontend na Androida.</h4>

Rillvoro to niezależny projekt oparty na [NewPipe](https://github.com/TeamNewPipe/NewPipe).

[English](/README.md) · [Deutsch](/doc/README.de.md) · [Español](/doc/README.es.md) · [Français](/doc/README.fr.md) · [हिन्दी](/doc/README.hi.md) · [Italiano](/doc/README.it.md) · [한국어](/doc/README.ko.md) · [Português do Brasil](/doc/README.pt_BR.md) · [Polski](/doc/README.pl.md) · [ਪੰਜਾਬੀ](/doc/README.pa.md) · [日本語](/doc/README.ja.md) · [うちなーぐち](/doc/README.ryu.md) · [Română](/doc/README.ro.md) · [Русский](/doc/README.ru.md) · [Soomaali](/doc/README.so.md) · [Türkçe](/doc/README.tr.md) · [正體中文](/doc/README.zh_TW.md) · [অসমীয়া](/doc/README.asm.md) · [Српски](/doc/README.sr.md) · [العربية](/doc/README.ar.md)

## Screenshoty

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

## Opis

Rillvoro nie używa żadnych bibliotek Google ani API YouTube. Strony są jedynie analizowane aby zdobyć wymagane informacje, dzięki czemu ta aplikacja może zostać zainstalowana na urządzeniach bez Usług Google Play. Konto YouTube nie jest wymagane aby używać Rillvoro, które jest wolnym oprogramowaniem copyleft.

### Funkcje

* Wyszukiwanie filmów
* Brak wymogu konta Google/YouTube
* Wyświetlanie generalnych informacji o filmach
* Oglądanie filmów na YouTube
* Słuchanie filmów na YouTube
* Tryb okienkowy (Pływające okno)
* Wybieranie odtwarzacza przez który możemy oglądać film
* Pobieranie filmów
* Pobieranie audio
* Otwieranie filmów w Kodi
* Pokazanie następnych/podobnych filmów
* Wyszukiwanie w YouTube w konkretnym języku
* Oglądanie/Blokowanie materiałów zablokowanych wiekowo.
* Wyświetlanie generalnych informacji o kanałach
* Wyszukiwanie kanałów
* Oglądanie filmów ze strony kanału
* Wsparcie dla Orbot/Tor (Jeszcze nie bezpośrednio)
* Wsparcie dla 1080p/2K/4K
* Historia oglądania
* Subskrybowanie kanałów
* Historia wyszukiwania
* Wyszukiwanie/Oglądanie playlist
* Oglądanie playlist w kolejce
* Dodawnaie filmów do kolejki
* Lokalne playlisty
* Napisy
* Wsparcie dla livestream'ów
* Wyświetlanie komentarzy

### Wspierane usługi

* YouTube
* SoundCloud \[beta\]
* media.ccc.de \[beta\]
* Instancje PeerTube \[beta\]
* Bandcamp \[beta\]

## Instalacja i aktualizacje

Aby zbudować pakiet APK w wersji debug, zainstaluj JDK 21 i Android SDK, a następnie wykonaj poniższe polecenia.

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

Podłącz urządzenie, włącz debugowanie USB i wykonaj

```sh
./gradlew :app:installDebug
```

## Wkład

[Wkład](/.github/CONTRIBUTING.md) · [GitHub Issues](https://github.com/culpen90/Rillvoro/issues)

## Polityka prywatności

[Polityka prywatności](/doc/privacy.md)

## Licencja
[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

Rillvoro to wolne oprogramowanie: Możesz używać, uczyć się, udostępniać i ulepszać je do woli.
Możesz udostępniać i/lub modyfikować je na zasadach licencji
[GNU General Public License](https://www.gnu.org/licenses/gpl.html)
publikowaną przez Free Software Foundation, wersję 3 Licencji, lub
(twój wybór) każdną nowszą wersję.
