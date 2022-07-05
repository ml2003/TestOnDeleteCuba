package com.company.single.web.screens.single;

import com.haulmont.cuba.gui.screen.*;
import com.company.single.entity.Single;

@UiController("single_Single.edit")
@UiDescriptor("single-edit.xml")
@EditedEntityContainer("singleDc")
@LoadDataBeforeShow
public class SingleEdit extends StandardEditor<Single> {
}