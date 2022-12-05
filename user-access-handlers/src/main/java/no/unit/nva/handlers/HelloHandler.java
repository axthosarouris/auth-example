package no.unit.nva.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import nva.commons.apigateway.ApiGatewayHandler;
import nva.commons.apigateway.RequestInfo;
import nva.commons.core.JacocoGenerated;

import java.net.HttpURLConnection;

public class HelloHandler extends ApiGatewayHandler<Void, Void> {


    @JacocoGenerated
    public HelloHandler() {
        super(Void.class);
    }


    @Override
    protected Integer getSuccessStatusCode(Void input, Void output) {
        return HttpURLConnection.HTTP_OK;
    }

    @Override
    protected Void processInput(Void input, RequestInfo requestInfo, Context context) {
        return null;
    }

}
