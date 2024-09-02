package {{ cookiecutter.github_username }}.nf.test.{{ cookiecutter.plugin_name|replace('nft-', '')}};

/*
 * Add your custom extensions to the path() method
 * 
 * @author: {{ cookiecutter.author_name }}
 */

public class PathExtension {

	public static void hello() {
		System.println("Hello from {{ cookiecutter.plugin_name }}");
	}

}