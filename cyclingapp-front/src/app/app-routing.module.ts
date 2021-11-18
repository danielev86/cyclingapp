import { LoginComponent } from './login/login.component';
import { CyclistListComponent } from './cyclist-list/cyclist-list.component';
import { HomeComponent } from './home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListTeamPageComponent } from './list-team-page/list-team-page.component';
import { TeamInsertComponent } from './team-insert/team-insert.component';
import { RouteGuardService } from './services/route-guard.service';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'login', component:LoginComponent},
  {path: 'home', component: HomeComponent},
  {path: 'teams', component: ListTeamPageComponent},
  {path: 'team-insert', component:TeamInsertComponent, canActivate:[RouteGuardService]},
  {path: 'cyclists', component:CyclistListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
