<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">Un front-end de streaming libre et léger pour Android.</h4>

Rillvoro est un projet indépendant dérivé de [NewPipe](https://github.com/TeamNewPipe/NewPipe).

[English](/README.md) · [Deutsch](/doc/README.de.md) · [Español](/doc/README.es.md) · [Français](/doc/README.fr.md) · [हिन्दी](/doc/README.hi.md) · [Italiano](/doc/README.it.md) · [한국어](/doc/README.ko.md) · [Português do Brasil](/doc/README.pt_BR.md) · [Polski](/doc/README.pl.md) · [ਪੰਜਾਬੀ](/doc/README.pa.md) · [日本語](/doc/README.ja.md) · [うちなーぐち](/doc/README.ryu.md) · [Română](/doc/README.ro.md) · [Русский](/doc/README.ru.md) · [Soomaali](/doc/README.so.md) · [Türkçe](/doc/README.tr.md) · [正體中文](/doc/README.zh_TW.md) · [অসমীয়া](/doc/README.asm.md) · [Српски](/doc/README.sr.md) · [العربية](/doc/README.ar.md)

## Captures d'écran

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

### Services supportés

* YouTube ([site web](https://www.youtube.com/)) et YouTube Music ([site web](https://music.youtube.com/)) ([wiki](https://fr.wikipedia.org/wiki/YouTube))
* PeerTube ([site web](https://joinpeertube.org/)) et toutes ses instances (regardez le site web pour savoir ce que cela signifie !) ([wiki](https://fr.wikipedia.org/wiki/PeerTube))
* Bandcamp ([site web](https://bandcamp.com/)) ([wiki](https://fr.wikipedia.org/wiki/Bandcamp))
* SoundCloud ([site web](https://soundcloud.com/)) ([wiki](https://fr.wikipedia.org/wiki/SoundCloud))
* media.ccc.de ([site web](https://media.ccc.de/)) ([wiki](https://fr.wikipedia.org/wiki/Chaos_Computer_Club))

## Description

Rillvoro fonctionne en récupérant les données requises à partir des APIs officielles (par exemple PeerTube) du service que vous utilisez. Si l'API officielle est limitée (par exemple YouTube) pour nos besoins, ou si elle est propriétaire, l'application analyse le site Web ou utilise une API interne à la place. Cela signifie que vous n'avez pas besoin de compte sur n'importe lequel des services proposés pour utiliser Rillvoro.

De plus, puisqu'il s'agit de logiciels libres et gratuits, ni l'application ni l'Extracteur n'utilisent de bibliothèques ou de frameworks propriétaires, comme les services Google Play. Cela signifie que vous pouvez utiliser Rillvoro sur des appareils ou des ROM personnalisées qui n'ont pas d'applications Google installées.

### Fonctionnalités

* Regarder des vidéos à des résolutions allant jusqu'à la 4K
* Écouter de l'audio en arrière-plan, en ne chargant que le flux audio pour économiser des données
* Mode Popup (lecteur floattant, aka Picture-in-Picture)
* Regarder des diffusions en direct
* Afficher/masquer les sous-titres
* Chercher des vidéos et des audios (sur Youtube, vous pouvez également spécifier la langue du contenu)
* Mettre en file d'attente les vidéos (et éventuellement les enregistrer en tant que listes de lecture locales)
* Afficher/cacher les informations générales à propos des vidéos (comme la description et les tags)
* Afficher/cacher les vidéos suivantes ou en relation
* Afficher/cacher les commentaires
* Chercher des vidéos, des audios, des chaînes, des listes de lecture et des albums
* Parcourir les vidéos et les audios d'une chaîne
* S'abonner à des chaînes (oui, sans avoir besoin de se connecter à un compte !)
* Recevoir des notifications sur les nouvelles vidéos des chaînes auxquelles vous êtes abonnés.
* Créer et modifier des groupes de chaînes (pour une gestion et une navigation plus simples)
* Parcourir des fils de vidéos générés depuis vos groupes de chaînes
* Voir et rechercher dans votre historique de visionnage
* Voir et chercher les listes de lectures (il s'agit de listes de lecture à distance, ce qui signifie qu'elles sont extraites du service sur lequel vous naviguez)
* Créer et éditer des listes de lecture locales (elles sont créées et sauvegardées dans l'application, et n'ont rien à voir avec n'importe lequel des services)
* Télécharger des vidéos/de l'audio/des sous-titres
* Lire dans Kodi
* Regarder/bloquer du contenu restreint en fonction de l'âge

## Installation et mises à jour

Installez le JDK 21 et le SDK Android, puis exécutez ces commandes pour compiler l’APK de débogage.

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

Branchez votre appareil, activez le débogage USB et exécutez

```sh
./gradlew :app:installDebug
```

## Contribuer

[Contribuer](/.github/CONTRIBUTING.md) · [GitHub Issues](https://github.com/culpen90/Rillvoro/issues)

## Politique de confidentialité

[Politique de confidentialité](/doc/privacy.md)

## Licence
[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

Rillvoro est un logiciel libre : vous pouvez l'utiliser, l'étudier, le partager et l'améliorer à volonté. Plus précisément, vous pouvez le redistribuer et/ou le modifier selon les conditions de la [GNU General Public License](https://www.gnu.org/licenses/gpl.html) telle que publiée par la Free Software Foundation, soit la version 3 de la Licence, soit (à votre choix) toute version ultérieure.
