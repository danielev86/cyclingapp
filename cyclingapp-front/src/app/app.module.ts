import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationbarComponent } from './navigationbar/navigationbar.component';
import { FooterComponent } from './footer/footer.component';
import { JumbotronComponent } from './jumbotron/jumbotron.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { ListTeamComponent } from './list-team/list-team.component';
import { ListTeamPageComponent } from './list-team-page/list-team-page.component';
import { TeamInsertComponent } from './team-insert/team-insert.component';
import { CyclistListComponent } from './cyclist-list/cyclist-list.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationbarComponent,
    FooterComponent,
    JumbotronComponent,
    HomeComponent,
    ListTeamComponent,
    ListTeamPageComponent,
    TeamInsertComponent,
    CyclistListComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
