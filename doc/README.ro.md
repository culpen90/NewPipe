<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">Un front-end de streaming „uşor” liber, pentru Android.</h4>

Rillvoro este un proiect independent derivat din [NewPipe](https://github.com/TeamNewPipe/NewPipe).

[English](/README.md) · [Deutsch](/doc/README.de.md) · [Español](/doc/README.es.md) · [Français](/doc/README.fr.md) · [हिन्दी](/doc/README.hi.md) · [Italiano](/doc/README.it.md) · [한국어](/doc/README.ko.md) · [Português do Brasil](/doc/README.pt_BR.md) · [Polski](/doc/README.pl.md) · [ਪੰਜਾਬੀ](/doc/README.pa.md) · [日本語](/doc/README.ja.md) · [うちなーぐち](/doc/README.ryu.md) · [Română](/doc/README.ro.md) · [Русский](/doc/README.ru.md) · [Soomaali](/doc/README.so.md) · [Türkçe](/doc/README.tr.md) · [正體中文](/doc/README.zh_TW.md) · [অসমীয়া](/doc/README.asm.md) · [Српски](/doc/README.sr.md) · [العربية](/doc/README.ar.md)

## Capturi de ecran

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

## Descriere

Rillvoro nu foloseşte nici-o bibliotecă Google framework sau API-ul Youtube. Website-urile sunt doar analizate pentru a prelua informaţia necesară, aşa că această aplicaţie poate fi folosită pe telefoane fără Serviciile Google instalate. De asemenea, nu aveţi nevoie de un cont Youtube pentru a folosi Rillvoro, care este sofware liber şi copylefted.

### Funcţii

* Căutarea videoclipurilor
* Nu este necesară logarea
* Afişarea informaţiilor generale despre videoclipuri
* Urmărirea videoclipurilor Youtube
* Ascultarea videoclipurilor Youtube
* Modul popup (player plutitor)
* Selectarea playerului de streaming pentru vizionarea videoclipului
* Descărcarea videoclipurilor
* Doar descărcarea sunetului
* Deschiderea videoclipurilor cu Kodi
* Expunerea videoclipurilor următoare/asociate
* Căutarea YouTube într-o limbă specifică
* Vizionarea/Blocarea materialului restricţionat în funcţie de vârstă
* Afişarea informaţiilor generale despre canale
* Căutarea canalelor
* Vizionarea videoclipurilor dintr-un canal
* Suport Orbot/Tor (încă nu direct)
* Suport 1080p/2K/4K
* Vizionarea istoricului
* Abonarea la canale
* Căutarea în istoric
* Căutarea/vizionarea playlisturilor
* Vizionarea ca playlisturi puse în coadă
* Punerea în coadă a videoclipurilor
* Playlisturi locale
* Subtitrări
* Suport al transmiterilor live
* Afişarea comentariilor

### Servicii întreţinute

* YouTube
* SoundCloud \[beta\]
* media.ccc.de \[beta\]
* Instanţe PeerTube \[beta\]
* Bandcamp \[beta\]

## Instalare şi actualizări

Pentru a compila APK-ul de depanare, instalează JDK 21 și Android SDK și rulează aceste comenzi.

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

Conectează dispozitivul, activează depanarea USB și rulează

```sh
./gradlew :app:installDebug
```

## Contribuţie

[Contribuţie](/.github/CONTRIBUTING.md) · [GitHub Issues](https://github.com/culpen90/Rillvoro/issues)

## Politica de Confidenţialitate

[Politica de Confidenţialitate](/doc/privacy.md)

## Licenţă
[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

Rillvoro este Software Gratuit: Îl puteţi folosi şi împărtăşi cum doriţi. Mai exact, îl puteți redistribui și / sau modifica în conformitate cu termenii
[GNU General Public License](https://www.gnu.org/licenses/gpl.html) aşa cum a fost publicat de Free Software Foundation, fie versiunea 3 a Licenței, fie
(la alegerea dvs.) orice versiune ulterioară.
