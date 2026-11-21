<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">Una interfaz de streaming ligera y libre para Android.</h4>

Rillvoro es un proyecto independiente basado en [NewPipe](https://github.com/TeamNewPipe/NewPipe).

[English](/README.md) · [Deutsch](/doc/README.de.md) · [Español](/doc/README.es.md) · [Français](/doc/README.fr.md) · [हिन्दी](/doc/README.hi.md) · [Italiano](/doc/README.it.md) · [한국어](/doc/README.ko.md) · [Português do Brasil](/doc/README.pt_BR.md) · [Polski](/doc/README.pl.md) · [ਪੰਜਾਬੀ](/doc/README.pa.md) · [日本語](/doc/README.ja.md) · [うちなーぐち](/doc/README.ryu.md) · [Română](/doc/README.ro.md) · [Русский](/doc/README.ru.md) · [Soomaali](/doc/README.so.md) · [Türkçe](/doc/README.tr.md) · [正體中文](/doc/README.zh_TW.md) · [অসমীয়া](/doc/README.asm.md) · [Српски](/doc/README.sr.md) · [العربية](/doc/README.ar.md)

## Capturas de Pantalla

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

## Descripción

Rillvoro no usa ninguna librería del framework de Google, ni la API de YouTube. Los sitios web solamente se analizan para extraer la información requerida, por lo que esta app se puede usar sin los servicios de Google instalados. Además, no se necesita una cuenta de YouTube para usar Rillvoro, que es un programa libre <i lang="en">copyleft</i>.

### Características

* Buscar videos
* No requiere inicio de sesión
* Mostrar información general sobre videos
* Mirar videos de YouTube
* Modo de solo audio en videos de YouTube
* Modo pop-up (reproductor flotante)
* Elegir un reproductor de video externo para mirar videos
* Descargar videos
* Descargar solo audio
* Abrir videos en Kodi
* Mostrar videos próximos/relacionados
* Buscar a través de YouTube en un idioma específico
* Mirar/Bloquear videos restringidos por edad
* Mostrar información general sobre canales
* Buscador de canales
* Mirar videos de un canal
* Soporte Orbot/Tor (todavía no directamente)
* Soporte para videos en 1080p/2K/4K
* Historial de videos vistos
* Suscripción a canales
* Historial de búsquedas
* Buscar/Mirar listas de reproducción
* Mirar listas de reproducción en cola
* Poner videos en cola
* Listas de reproducción locales
* Subtítulos
* Soporte para transmisiones en vivo
* Mostrar comentarios

### Servicios Soportados

* YouTube
* SoundCloud \[beta\]
* media.ccc.de \[beta\]
* PeerTube instances \[beta\]
* Bandcamp \[beta\]

## Instalación y Actualizaciones

Instala el JDK 21 y el SDK de Android y ejecuta estos comandos para compilar el APK de depuración.

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

Conecta el dispositivo, activa la depuración USB y ejecuta

```sh
./gradlew :app:installDebug
```

## Contribución

[Contribución](/.github/CONTRIBUTING.md) · [GitHub Issues](https://github.com/culpen90/Rillvoro/issues)

## Política de Privacidad

[Política de Privacidad](/doc/privacy.md)

## Licencia

[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.html)

Rillvoro es Software Libre: Puede usarlo, estudiarlo, compartirlo y mejorarlo a su voluntad. Más específicamente, puede redistribuirlo y/o modificarlo bajo los términos de la [GNU General Public License](https://www.gnu.org/licenses/gpl.html) publicada por la Free Software Foundation tanto si usa la versión 3 o posterior de la licencia.
