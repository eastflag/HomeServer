import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpModule, JsonpModule} from '@angular/http';

import {AppComponent} from './app.component';
import {routing, appRoutingProviders} from './app.routing';
import {HomeComponent} from './home/home.component';
import {AboutComponent} from './about/about.component';
import {BoardComponent} from "./board/board.component";
import {BoardService} from "./board/board.service";
import {BoardDetailComponent} from "./board/board-detail.component";
import {BoardWriteComponent} from "./board/board-write.component";

@NgModule({
    declarations: [
        AppComponent,
        HomeComponent,
        AboutComponent,
        BoardComponent, BoardDetailComponent, BoardWriteComponent
    ],
    imports: [
        BrowserModule,
        FormsModule,
        HttpModule,
        JsonpModule,
        routing
    ],
    providers: [appRoutingProviders, BoardService],
    bootstrap: [AppComponent]
})

export class AppModule {
}
