package {{ cookiecutter.github_username }}.nf.test.{{ cookiecutter.plugin_name|replace('nft-', '')}};

/*
 * Add your custom methods to nf-test
 * 
 * @author: {{ cookiecutter.author_name }}
 */

public class Methods {

    public static void hello() {
        System.out.println("Hello from {{ cookiecutter.plugin_name }}");
    }

}