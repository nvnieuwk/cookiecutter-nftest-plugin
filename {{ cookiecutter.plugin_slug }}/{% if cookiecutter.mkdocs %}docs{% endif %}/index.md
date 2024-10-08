# {{ cookiecutter.plugin_name }}

{{ cookiecutter.description }}

## Start using the plugin

To start using the plugin please add it to your `nf-test.config` file:

```groovy title="nf-test.config"
config {
    plugins {
        load "{{ cookiecutter.plugin_name }}@{{ cookiecutter.version }}"
    }
}
```

## Use a development version

To use the development version, please do the following steps:

- Clone the [{{ cookiecutter.plugin_name }} repository]({{ cookiecutter.github_url }})

=== "HTTPS"

    ```bash
    git clone {{ cookiecutter.github_url }}.git
    ```

=== "SSH"

    ```bash
    git clone {{ cookiecutter.github_url|replace('https://', 'git@')|replace('github.com/','github.com:') }}.git
    ```

- Run the build script

```bash
./build.sh
```

- Add the jar location (visible at the end of the build script output) to the `nf-test.config` file

```groovy title="nf-test.config"
config {
    plugins {
        loadFromFile "full/path/to/the/plugin/jar"
    }
}
```

- Or add the plugin jar to an nf-test command:

```bash title="Terminal"
nf-test test --plugins full/path/to/the/plugin/jar
```

!!! note

    The plugin jar will always be located in the `target/` directory in the root of the plugin repository


