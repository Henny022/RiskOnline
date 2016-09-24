package de.henny022.RiskOnline.Territories;

import java.util.List;

/**
 * Created by henny on 24.09.16.
 */
public class Continent
{
    private ContinentEnum continentEnum;
    private String name;
    private List<Territory> territories;
    private int reinforcements;

    public Continent(ContinentEnum continentEnum, String name, List<Territory> territories, int reinforcements)
    {
        this.continentEnum = continentEnum;
        this.name = name;
        this.territories = territories;
        this.reinforcements = reinforcements;
    }

    public ContinentEnum getContinentEnum()
    {
        return continentEnum;
    }

    public String getName()
    {
        return name;
    }

    public List<Territory> getTerritories()
    {
        return territories;
    }

    public int getReinforcements()
    {
        return reinforcements;
    }

    public boolean equals(Continent continent)
    {
        return this.continentEnum.equals(continent.getContinentEnum());
    }
}
