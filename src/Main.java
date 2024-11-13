import api.ClientesAPI;
import com.google.gson.*;
import config.ConfigsApi;
import entities.dto.ClientesDTO;
import netscape.javascript.JSObject;
import services.ClientesService;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ClientesAPI clientesAPI = new ClientesAPI();
        clientesAPI.salvarClientes();

    }
}