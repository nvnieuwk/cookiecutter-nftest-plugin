# cookiecutter-nftest-plugin
A cookiecutter template for an nf-test plugin


## Usage

1. Make sure [`cruft`](https://cruft.github.io/cruft/) is installed, otherwise install it (see the [installation guide](https://cruft.github.io/cruft/#installation))

2. Run the following command in a directory where you want to setup the plugin directory:

```bash
cruft create https://github.com/nvnieuwk/cookiecutter-nftest-plugin
```

3. Fill in all values for your plugin. See below for a full list of all values with their detailed descriptions

| value | description |
--------|--------------
| plugin_name | The name of the plugin |
| plugin_slug | The name of the plugin without whitespaces. This value will be used to name the plugin directory |
| description | The description of the plugin. This will be automatically added to the documentation |
| github_username | The github username or github organization the plugin repository will be hosted by |
| github_url | The URL to the github repository |
| github_default_branch | The default branch to use, default is `main` |
| version | The version to use for the plugin, default is `0.1.0` |
| mkdocs | Initiate documentation via mkdocs, see below on how to set this up for your repository |
| docsite_url | The url to the mkdocs documentation site. This will default the to location of the github pages. This value is ignored if `mkdocs` is `false` |
| author_name | The full name of the author, defaults to the github username |
| release_date | The release date of the plugin, defaults to the current date. This value is solely used to determine the year for the next value so shouldn't be changed |
| year | The year of the plugin release. This value should not be changed unless absolutely necessary |

## Set up mkdocs

1. Go to the `Settings` tab of the plugin github repository.
2. Go to `Pages` under `Code and automation`.
3. Under `Build and deployment`, choose `Deploy from a branch` as `Source` and choose `gh-pages` as `Branch`.

> [!NOTE]
> The `gh-pages` branch will be automatically generated once the generated code has been published to the `main` branch. 

4. Go back to the `Code` tab of the repository and click on the cog next to `About`
5. Check `Use your Github Pages website` to automatically display the documentation site on the front page of the repository

The `.github/workflows/build.yml` CI script will automatically update your documentation once a new commit has been made to the `main` branch. This documentation will be automatically versioned based on the version in `src/main/resources/META-INF/nf-test-plugin` file. 

> [!NOTE]
> Use the `bump-version.sh` script to automatically update all versions in the relevant places to the newer version.

All versions containing `dev` will be automatically used to update the `dev` version of the plugin, this way the `dev` version of the documentation will always contain the documentation for the latest `dev` version. Older `dev` documentation will always be overwritten. 

> [!WARNING]
> It's possible that the `dev` documentation will be shown as the newest documentation when you set it up first. You can fix this by going to the `versions.json` file in the `gh-pages` branch and updating the `aliases` so your desired latest version has the `latest` alias.

## Using custom scripts

### `build.sh`

This script will automatically build the plugin and add the `.jar` file to the `target/` folder.

### `test.sh`

This script will run all tests of the plugin that are situated in the `tests` folder.

### `bump-version.sh`

This version will update the plugin version in all relevant places.

```bash
bash bump-version.sh <version>
```