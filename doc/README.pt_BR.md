<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">Uma interface de streaming leve e gratuita para Android.</h4>

Rillvoro é um projeto independente derivado do [NewPipe](https://github.com/TeamNewPipe/NewPipe).

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

### Serviços Suportados

* YouTube ([site](https://www.youtube.com/)) e YouTube Music ([site](https://music.youtube.com/)) ([wiki](https://en.wikipedia.org/wiki/YouTube))
* PeerTube ([site](https://joinpeertube.org/)) e todas suas instâncias (abra o site para saber o que isso significa!) ([wiki](https://en.wikipedia.org/wiki/PeerTube))
* Bandcamp ([site](https://bandcamp.com/)) ([wiki](https://en.wikipedia.org/wiki/Bandcamp))
* SoundCloud ([site](https://soundcloud.com/)) ([wiki](https://en.wikipedia.org/wiki/SoundCloud))
* media.ccc.de ([site](https://media.ccc.de/)) ([wiki](https://en.wikipedia.org/wiki/Chaos_Computer_Club))

## Descrição

Rillvoro funciona buscando os dados necessários da API oficial (ex. PeerTube) ou do serviço que você está usando. Se a API oficial é restrita (ex. YouTube) para nossos propósitos, ou é proprietária, o aplicativo analisa o site ou usa uma API interna. Isso significa que não é preciso ter uma conta de qualquer serviço para usar o Rillvoro.

Também, desde que somos um software livre e de código aberto, nem o aplicativo e nem o Extractor usa qualquer biblioteca ou framework proprietário, como o Google Play Services. Isso significa que você pode usar o Rillvoro em dispositivos ou ROMs customizadas em que não tem os aplicativos do Google instalados.

### Recursos

* Assistir vídeos em resoluções de até 4K
* Escutar o áudio em segundo plano, carregando apenas o fluxo de áudio para salvar dados
* Modo popup (player flutuante, aka Picture-in-Picture)
* Assista a transmissões ao vivo
* Mostrar/esconder legendas/closed captions
* Buscar vídeos e áudios (no YouTube, você pode especificar o conteúdo da linguagem também)
* Enfileirar vídeos (e opcionalmente salvar eles como playlists locais)
* Mostrar/esconder informações gerais sobre os vídeos (como descrições e tags)
* Mostrar/esconder vídeos próximos/relacionados
* Mostrar/esconder comentários
* Buscar vídeos, áudios, canais, playlists e álbuns
* Navegar vídeos e áudios dentro de um canal
* Inscrever-se a canais (sim, mesmo se não estiver logado a qualquer conta!)
* Receba notificações sobre novos vídeos de canais em que você está inscrito
* Crie e edite grupos de canais (para facilitar a navegação e o gerenciamento)
* Navege feeds de vídeo gerados a partir dos seus grupos de canais
* Veja e pesquise seu histórico de vídeos
* Pesquise e assista playlists (Eles são playlists remotas, o que significa que eles serão obtidos do serviço que você está navegando)
* Crie e edite playlists locais (Eles são criados e salvos no aplicativo, e não são relacionados com nenhum serviço)
* Baixe vídeos/áudios/legendas (closed captions)
* Abra no Kodi
* Assista/Bloqueie material restrito

## Instalação e atualizações

Para compilar o APK de depuração, instale o JDK 21 e o SDK do Android e execute os comandos abaixo.

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

Conecte o dispositivo, ative a depuração USB e execute

```sh
./gradlew :app:installDebug
```

## Contribuições

[Contribuições](/.github/CONTRIBUTING.md) · [GitHub Issues](https://github.com/culpen90/Rillvoro/issues)

## Política de Privacidade

[Política de Privacidade](/doc/privacy.md)

## Licença
[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

Rillvoro é Software Livre: Você pode usar, estudar compartilhamento e melhorá-lo à sua vontade.
 Especificamente, você pode redistribuir e/ou modificá-lo sob os termos do
[GNU General Public License](https://www.gnu.org/licenses/gpl.html) publicado pela Free Software Foundation, seja a versão 3 da Licença, ou
(a sua opção) qualquer versão posterior.
