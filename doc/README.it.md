<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">Un <i>frontend</i> di streaming libero e leggero per Android.</h4>

Rillvoro è un fork indipendente di [NewPipe](https://github.com/TeamNewPipe/NewPipe).

[English](/README.md) · [Deutsch](/doc/README.de.md) · [Español](/doc/README.es.md) · [Français](/doc/README.fr.md) · [हिन्दी](/doc/README.hi.md) · [Italiano](/doc/README.it.md) · [한국어](/doc/README.ko.md) · [Português do Brasil](/doc/README.pt_BR.md) · [Polski](/doc/README.pl.md) · [ਪੰਜਾਬੀ](/doc/README.pa.md) · [日本語](/doc/README.ja.md) · [うちなーぐち](/doc/README.ryu.md) · [Română](/doc/README.ro.md) · [Русский](/doc/README.ru.md) · [Soomaali](/doc/README.so.md) · [Türkçe](/doc/README.tr.md) · [正體中文](/doc/README.zh_TW.md) · [অসমীয়া](/doc/README.asm.md) · [Српски](/doc/README.sr.md) · [العربية](/doc/README.ar.md)

## Screenshot

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

### Servizi Supportati

* YouTube ([sito](https://www.youtube.com/)) e YouTube Music ([sito](https://music.youtube.com/)) ([wiki](https://en.wikipedia.org/wiki/YouTube))
* PeerTube ([sito](https://joinpeertube.org/)) e tutte le sue istanze (apri il sito per capire cosa significa!) ([wiki](https://en.wikipedia.org/wiki/PeerTube))
* Bandcamp ([sito](https://bandcamp.com/)) ([wiki](https://en.wikipedia.org/wiki/Bandcamp))
* SoundCloud ([sito](https://soundcloud.com/)) ([wiki](https://en.wikipedia.org/wiki/SoundCloud))
* media.ccc.de ([sito](https://media.ccc.de/)) ([wiki](https://en.wikipedia.org/wiki/Chaos_Computer_Club))

## Descrizione

Rillvoro svolge le sue funzioni prendendo i dati richiesti dall'API (ad es. PeerTube) del servizio che stai usando. Se l'API ufficiale ha delle restrinzioni (ad es. YouTube) per i nostri scopi, o è proprietaria, invece, l'app analizza il sito o usa un'API interna. Questo significa che non hai bisogno di un account su nessun servizio per usare Rillvoro.

Inoltre, siccome sono programmi liberi e *open-source*, nè l'app nè l'estrattore usano alcuna libreria o *framework* proprietario, come i Google Play Services. Questo vuol dire che puoi usare Rillvoro su dispositivi o *ROM custom* che non hanno le app Google installate.

### Funzionalità

* Guarda video a risoluzioni fino al 4K
* Ascolta audio in sottofondo, caricando solo il flusso audio per risparmiare dati
* Modalità pop-up (lettore *floating*, anche noto come *Picture-in-Picture*)
* Guarda dirette
* Mostra/nascondi sottotitoli
* Cerca video e audio (su YouTube, puoi anche specificare la lingua dei contenuti)
* Accoda video (e salvali facoltativamente come *playlist* locali)
* Mostra/nascondi informazioni sui video (come descrizione e *tag*)
* Mostra/nascondi prossimi video o video correlati
* Mostra/nascondi commenti
* Cerca video, audio, canali, *playlist* e *album*
* Esplora video e audio in un canale
* Iscriviti a canali (sì, senza entrare in alcun *account*!)
* Ricevi notifiche su video nuovi di canali a cui sei iscritto
* Crea e modifica gruppi di canali (per navigazione e gestione facili)
* Esplora *feed* di video generati dai tuoi gruppi di canali
* Visualizza la tua cronologia e cerca in quest'ultima
* Cerca e guarda *playlist* (queste sono *playlist* remote, il chè significa che sono prese dal servizio che stai esplorando)
* Crea e modifica *playlist* locali (queste sono create e salvate nell'app, e non hanno niente a che fare con alcun servizio)
* Scarica video/audio/sottotitoli (*closed caption*)
* Apri in Kodi
* Guarda/Blocca materiale soggetto a limiti di età

## Installazione e aggiornamenti

Per compilare l’APK di debug, installa il JDK 21 e l’SDK Android ed esegui questi comandi.

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

Collega il dispositivo, attiva il debug USB ed esegui

```sh
./gradlew :app:installDebug
```

## Contribuire

[Contribuire](/.github/CONTRIBUTING.md) · [GitHub Issues](https://github.com/culpen90/Rillvoro/issues)

## Privacy Policy

[Privacy Policy](/doc/privacy.md)

## Licenza

[![Immagine GNU GPLv3](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

Rillvoro è Software Libero: Puoi usarlo, studiarlo, condividerlo e migliorarlo a tuoi piacimento. Specificamente, puoi ridistribuirlo e/o modificarlo sotto i termini della [GNU General Public License](https://www.gnu.org/licenses/gpl.html) come pubblicata dalla Free Software Foundation, o la versione 3 della Licenza, o (a tua scelta) qualsiasi versione successiva.
