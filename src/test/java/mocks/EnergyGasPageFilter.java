package mocks;

/**
 * Created by RSen on 28/03/2017.
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

    public class EnergyGasPageFilter {

        private final EnergyGasPageRepository energyGasPageDetails;

        public EnergyGasPageFilter(EnergyGasPageRepository energyGasPageDetails) {// injecting the repo to
            // the constructor
            this.energyGasPageDetails = energyGasPageDetails;
        }

        public List<EnergyGasPageMock> filter() {

            List<EnergyGasPageMock> filtered = new ArrayList<EnergyGasPageMock>();

            for (EnergyGasPageMock energyGasPageMock : energyGasPageDetails.all()) {
                if (energyGasPageMock.getGasTariff().equals("EnergyPlan Paper Billing") && energyGasPageMock.getPaymentMethod().equals("Monthly Direct Debit") && energyGasPageMock.getKwhUsage().equals("12500")) {
                    filtered.add(energyGasPageMock);

            }

            }
            return filtered;
        }
    }

