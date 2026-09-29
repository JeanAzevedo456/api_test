package api_teste.ds.configs;

import org.springframework.context.annotation.Configuration; //Importa a anotação da configuração do Spring Container
import org.springframework.web.servlet.config.annotation.CorsRegistration; //Importa a classe responasavel por registrar as regras do CORS
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc; // Importa a anotação que habilita os recursos do Spring Web MVC
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer; // Importa a interface de customização do Spring MVC

@Configuration // Indica que essa classe possui donfigurações de Beans que devem ser Inicializadas com o Spring
@EnableWebMvc // Importa e ativa o suporte basico as requisiçoes e controladores Web Mvc do Spring

public class WebConfig implements WebMvcConfigurer{ // Classe de configuração que implementa o contrato de customização do Spring
 
    @Override //Sobrescreve o metodo de mapeamento CROS padrão da interface WebMvcConfigurer
public void addCorsMapping (CorsRegistry registry){ //Metodo indicado pelo Spring para registrar as regras do CORS
    registry.addMapping("/**"); // Libera qualquer rota da API(coringa "/**") para aceitar chamadas externas
}

}
