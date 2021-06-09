package week2.adapter;

import week2.adapter.connectors.ConnectorA;
import week2.adapter.connectors.ConnectorB;

public class ABAdapter implements ConnectorB {

    private ConnectorA connector;

    public ABAdapter(ConnectorA connector) {
        this.connector = connector;
    }

    @Override
    public void connectorFunction() {
        connector.connectorFunction();
    }

}
