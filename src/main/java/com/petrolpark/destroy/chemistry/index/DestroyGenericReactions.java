package com.petrolpark.destroy.chemistry.index;

import com.petrolpark.destroy.chemistry.group.ChlorideGroup;

public class DestroyGenericReactions {

    public static final HydroxideSubstitutions HYDROXIDE_SUBSTITUTION = new HydroxideSubstitutions(ChlorideGroup::new);

    public static void register() {};
}