package com.company.single.web.screens.multi;

import com.haulmont.cuba.gui.screen.*;
import com.company.single.entity.Multi;

@UiController("single_Multi.browse")
@UiDescriptor("multi-browse.xml")
@LookupComponent("multisTable")
@LoadDataBeforeShow
public class MultiBrowse extends StandardLookup<Multi> {
}