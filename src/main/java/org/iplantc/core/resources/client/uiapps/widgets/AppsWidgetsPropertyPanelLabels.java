package org.iplantc.core.resources.client.uiapps.widgets;

import org.iplantc.core.resources.client.uiapps.widgets.argumentTypes.ArgumentGroupLabels;
import org.iplantc.core.resources.client.uiapps.widgets.argumentTypes.DoubleSelectionLabels;
import org.iplantc.core.resources.client.uiapps.widgets.argumentTypes.FileInputTypeLabels;
import org.iplantc.core.resources.client.uiapps.widgets.argumentTypes.FolderInputTypeLabels;
import org.iplantc.core.resources.client.uiapps.widgets.argumentTypes.InfoTypeLabels;
import org.iplantc.core.resources.client.uiapps.widgets.argumentTypes.IntegerSelectionLabels;
import org.iplantc.core.resources.client.uiapps.widgets.argumentTypes.MultiFileInputLabels;
import org.iplantc.core.resources.client.uiapps.widgets.argumentTypes.TreeSelectionLabels;

import com.google.gwt.i18n.client.Messages;

public interface AppsWidgetsPropertyPanelLabels extends Messages, ArgumentGroupLabels, InfoTypeLabels, FileInputTypeLabels, FolderInputTypeLabels, MultiFileInputLabels, IntegerSelectionLabels,
        DoubleSelectionLabels, TreeSelectionLabels {

    String appDescriptionEmptyText();

    String appDescriptionLabel();

    String appNameEmptyText();

    String appNameLabel();

    String argumentOption();

    String argumentOptionEmptyText();

    String checkboxEmptyText();

    String checkboxLabel();

    String defaultCheckboxLabel();

    String defaultEnvVarLabel();

    String defaultFileOutputlabel();

    String defaultFolderOutputLabel();

    String defaultMultiFileOutputLabel();

    String defaultTextLabel();

    String defaultValueLabel();

    String detailsPanelHeader();

    String doNotPass();

    String doubleInputLabel();

    String doubleInputWidgetEmptyText();

    String envVarEmptyText();

    String envVarLabel();

    String envVarWidgetEmptyText();

    String excludeWhenEmpty();

    String fileOutputEmptyText();

    String fileOutputLabel();

    String fileOutputSourceLabel();

    String folderOutputEmptyText();

    String folderOutputLabel();

    String folderOutputSourceLabel();

    String integerInputLabel();

    String integerInputWidgetEmptyText();

    String isRequired();

    String isVisible();

    String multiFileOutputEmptyText();

    String multiFileOutputLabel();

    String multiFileOutputSourceLabel();

    String multiFileWidgetEmptyText();

    String multiLineTextLabel();

    String referenceAnnotationEmptyText();

    String referenceAnnotationLabel();

    String referenceGenomeEmptyText();

    String referenceGenomeLabel();

    String referenceSequenceEmptyText();

    String referenceSequenceLabel();

    String singleSelectDisplayColumnHeader();

    String singleSelectIsDefaultColumnHeader();

    String singleSelectNameColumnHeader();

    String singleSelectToolTipColumnHeader();

    String singleSelectValueColumnHeader();

    String textInputEmptyText();

    String textInputLabel();

    String textInputWidgetEmptyText();

    String textSelectionEmptyText();

    String textSelectionLabel();

    String toolTipEmptyText();

    String toolTipText();

    String toolUsedEmptyText();

    String toolUsedLabel();

    String validatorRulesLabel();
}