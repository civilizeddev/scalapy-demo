# scalapy-demo

## Installation

### Ubuntu 혹은 Windows 10 + WSL 사용자 (필수)

```
$ sudo apt update

// sudo apt update error: "Release file is not yet valid" 오류 발생시:
$ sudo hwclock --hctosys

$ sudo apt upgrade
$ sudo apt install -y build-essential libncurses5-dev libffi-dev libbz2-dev zlib1g zlib1g-dev libreadline-dev libsqlite3-dev
```

### pyenv 설치

```
$ brew install pyenv
$ brew install pyenv-virtualenv
```

### python 설치

```
$ pyenv install --list
$ pyenv install 3.9.6
$ pyenv versions
```

### ~/.profile 업데이트

```
...

export PYENV_ROOT="$HOME/.pyenv"
export PATH="$PYENV_ROOT/shims:$PATH"

if which pyenv > /dev/null; then eval "$(pyenv init -)"; fi
if which pyenv-virtualenv-init > /dev/null; then eval "$(pyenv virtualenv-init -)"; fi
```

### poetry 설치

```
$ brew install poetry
```

## Manage Project

### venv 생성

```
$ poetry shell
```

---

## References

- [shadaj/scalapy](https://github.com/shadaj/scalapy)
- [scalapy.dev](https://scalapy.dev/)
