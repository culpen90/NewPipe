<p align="center"><img src="/assets/rillvoro_icon.png" alt="Rillvoro" width="150"></p>
<h2 align="center"><b>Rillvoro</b></h2>
<h4 align="center">Свободный и легковесный клиент потоковых сервисов для Android.</h4>

Rillvoro — независимый проект на основе [NewPipe](https://github.com/TeamNewPipe/NewPipe).

[English](/README.md) · [Deutsch](/doc/README.de.md) · [Español](/doc/README.es.md) · [Français](/doc/README.fr.md) · [हिन्दी](/doc/README.hi.md) · [Italiano](/doc/README.it.md) · [한국어](/doc/README.ko.md) · [Português do Brasil](/doc/README.pt_BR.md) · [Polski](/doc/README.pl.md) · [ਪੰਜਾਬੀ](/doc/README.pa.md) · [日本語](/doc/README.ja.md) · [うちなーぐち](/doc/README.ryu.md) · [Română](/doc/README.ro.md) · [Русский](/doc/README.ru.md) · [Soomaali](/doc/README.so.md) · [Türkçe](/doc/README.tr.md) · [正體中文](/doc/README.zh_TW.md) · [অসমীয়া](/doc/README.asm.md) · [Српски](/doc/README.sr.md) · [العربية](/doc/README.ar.md)

## Скриншоты

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

### Поддерживаемые сервисы

* YouTube ([сайт](https://www.youtube.com/)) и YouTube Music ([сайт](https://music.youtube.com/)) ([Вики](https://en.wikipedia.org/wiki/YouTube))
* PeerTube ([сайт](https://joinpeertube.org/)) и все его вариации (откройте этот сайт, чтобы понять о чём мы!) ([Вики](https://en.wikipedia.org/wiki/PeerTube))
* Bandcamp ([сайт](https://bandcamp.com/)) ([Вики](https://en.wikipedia.org/wiki/Bandcamp))
* SoundCloud ([сайт](https://soundcloud.com/)) ([Вики](https://en.wikipedia.org/wiki/SoundCloud))
* media.ccc.de ([сайт](https://media.ccc.de/)) ([Вики](https://en.wikipedia.org/wiki/Chaos_Computer_Club))

## Описание

Rillvoro работает, извлекая необходимые данные из официального API (например, PeerTube) сервиса, который вы используете. Если официальный API ограничен (например, YouTube) для наших целей или является проприетарным, приложение анализирует веб-сайт или использует вместо этого внутренний API. Это означает, что вам не нужна учетная запись в этих сервисах для использования Rillvoro.

Кроме того, поскольку это бесплатное и открытое программное обеспечение, ни приложение, ни Extractor не используют какие-либо проприетарные библиотеки или платформы, такие как Google Play Services. Это означает, что вы можете использовать Rillvoro на устройствах или пользовательских ROM, на которых не установлены приложения Google.

### Возможности

* Смотрите видео с разрешением до 4K
* Слушайте аудио в фоновом режиме, загружая аудиопоток только для сохранения данных
* Режим всплывания (плавающий плеер, он же «Картинка в картинке»)
* Смотрите прямые трансляции
* Показать/скрыть субтитры/скрытые титры
* Поиск видео и аудио (на YouTube вы также можете указать язык контента)
* Очередь видео (и, при желании, сохраняйте их как локальные плейлисты)
* Показать/скрыть общую информацию о видео (например, описание и теги)
* Показать/скрыть следующие/похожие видео
* Показать/скрыть комментарии
* Поиск видео, аудио, каналов, плейлистов и альбомов
* Просматривайте видео и аудио на канале
* Подписывайтесь на каналы (да, без входа в какой-либо аккаунт!)
* Получайте уведомления о новых видео с каналов, на которые вы подписаны
* Создавайте и редактируйте группы каналов (для более удобного просмотра и управления)
* Просматривайте ленты с видео, добавленными из ваших групп каналов
* Обзор и поиск истории просмотра
* Поиск и просмотр списков воспроизведения (это удаленные списки воспроизведения, что означает, что они получены из сервиса, которую вы просматриваете)
* Создавайте и редактируйте локальные списки воспроизведения (они создаются и сохраняются в приложении и не имеют ничего общего с каким-либо сервисом)
* Скачивайте видео/аудио/субтитры (скрытые титры)
* Откройте в Kodi
* Смотрите/блокируйте материалы с возрастным ограничением

## Установка и обновления

Чтобы собрать отладочный APK, установите JDK 21 и Android SDK, затем выполните следующие команды.

```sh
git clone https://github.com/culpen90/Rillvoro.git
cd Rillvoro
./gradlew :app:assembleDebug
```

Подключите устройство, включите отладку по USB и выполните

```sh
./gradlew :app:installDebug
```

## Участие

[Участие](/.github/CONTRIBUTING.md) · [GitHub Issues](https://github.com/culpen90/Rillvoro/issues)

## Политика конфиденциальности

[Политика конфиденциальности](/doc/privacy.md)

## Лицензия
[![Изображение GNU GPLv3](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.ru.html)

Rillvoro — это бесплатное программное обеспечение: вы можете использовать, изучать, делиться и улучшать его по своему усмотрению. В частности, вы можете распространять и/или изменять ее в соответствии с условиями [Стандартной общественной лицензии GNU](https://www.gnu.org/licenses/gpl.html) (GPL-3.0), опубликованной Free Software Foundation, либо версии 3 Лицензии или (на ваш выбор) любая более поздняя версия.
