package contracts.controllers;

import contracts.viewmodel.BaseViewModel;

public interface BaseController {

    BaseViewModel createBaseViewModel(String pageTitle);
}