package de.henny022.RiskOnline.Territories;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by henny on 14.10.16.
 */
public class World
{
    private static World ourInstance = new World();

    public static World getInstance()
    {
        return ourInstance;
    }

    private Map<ETerritory, Territory> territories = new HashMap<>();
    private Map<EContinent, Continent> continents = new HashMap<>();

    private World()
    {
    }

}
