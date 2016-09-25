package de.henny022.RiskOnline.Territories;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by henny on 24.09.16.
 */
public class World
{
    private static World ourInstance = new World();
    private List<Continent> continents;

    private World()
    {
        continents = new ArrayList<>(6);
        continents.add(Continents.NORTH_AMERICA);
        continents.add(Continents.SOUTH_AMERICA);
        continents.add(Continents.EUROPE);
        continents.add(Continents.AFRICA);
        continents.add(Continents.ASIA);
        continents.add(Continents.AUSTRALIA);
    }

    public static World getInstance()
    {
        return ourInstance;
    }
}
