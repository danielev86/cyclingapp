import { HomeComponent } from './home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListTeamPageComponent } from './list-team-page/list-team-page.component';
import { TeamInsertComponent } from './team-insert/team-insert.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'home', component: HomeComponent},
  {path: 'teams', component: ListTeamPageComponent},
  {path: 'team-insert', component:TeamInsertComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
