package com.company.single.web.screens.single;

import com.haulmont.cuba.gui.screen.*;
import com.company.single.entity.Single;

@UiController("single_Single.browse")
@UiDescriptor("single-browse.xml")
@LookupComponent("singlesTable")
@LoadDataBeforeShow
public class SingleBrowse extends StandardLookup<Single> {
}